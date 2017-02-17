
var http = require('http');
var express = require('express');
var fs = require('fs');
var path = require('path');
var bodyParser = require('body-parser');
var empty = require('is-empty');
var app = express();
var port = 9999;

var SAMPLE = fs.readFileSync(path.resolve(__dirname,'files/long.txt'));
var OUT = null;
if(process.env.hasOwnProperty('OUT_FILE') && !empty(process.env.OUT_FILE)){
    OUT = fs.openSync(process.env.OUT_FILE, 'a+');
}

function getMessage(length){
   if(length > SAMPLE.length){
       console.info("Punt. Only writing a message of length %d", SAMPLE.length);
       length = SAMPLE.length;
   }
   return SAMPLE.toString('utf8',0,length);
}

function log(message){
    message = JSON.stringify({ "message" : message });
    if(OUT === null){
        console.log(message);
    }else{
       fs.write(OUT, message);
       fs.write(OUT, '\n');
    }
}

app.use(express.static('public'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({
        extended: true
}));

app.get('/', function (req, res) {
  res.sendFile('index.html',{root: 'public'})
});

app.post('/log', function(req, res) {
  var length = parseInt(req.body.length_in_bytes);
  console.info("generating message of size %d", length);
  log(getMessage(length));
  res.sendFile('index.html',{root: 'public'})
});

if(!empty(process.env.OPENSHIFT_NODEJS_PORT)){
    port = process.env.OPENSHIFT_NODEJS_PORT;
}

app.listen(port, function(){
  console.log('Express server listening on port %d',port);
});

