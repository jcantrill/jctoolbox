var fs = require('fs');
var path = require('path');
var sleep = require('sleep');
var SAMPLE = fs.readFileSync(path.resolve(__dirname,'files/long.txt'));

length = process.env.hasOwnProperty('MSG_SIZE') ? parseInt(process.env.MSG_SIZE) : 1000
if(length > SAMPLE.length){
   console.info("Punt. Only writing a message of length %d", SAMPLE.length);
   length = SAMPLE.length;
}
var MESSAGE = SAMPLE.toString('utf8',0,length)

msg_per_sec = process.env.hasOwnProperty('MSG_PER_SEC') ? parseInt(process.env.MSG_PER_SEC) : null
sleep_in_micro = null;
if(msg_per_sec){
  sleep_in_micro = 1.0 / msg_per_sec * 1000000;
}

while(true){
  console.log(new Date().toISOString() + " " + MESSAGE);
  if(sleep_in_micro){
    sleep.usleep(sleep_in_micro);
  }
}