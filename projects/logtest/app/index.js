var bodyParser = require('body-parser');
var multer = require('multer');
var util = require('util');
var express = require('express');

var app = express();
var upload = multer();

app.set('view engine', 'ejs');
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: true}));

app.get('/', function(req,res, next){
    res.render('inputs');
});

app.post('/running', upload.array(), function(req, res, next){
    var formData = req.body;
    console.log(util.format('Starting with params: %j', formData));
    res.render('running');
});

app.get('/hello', function(req, res, next){
    res.render('hello');
});

app.listen(3000, function(){
    console.log("Server started...");
});
