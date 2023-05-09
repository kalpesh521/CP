var http = require('http');
var fs = require('fs');
var path = require('path');

http.createServer(function (req, res) {
    if(req.url === "/"){
        fs.readFile("./index.html", "UTF-8", function(err, html){
            res.writeHead(200, {"Content-Type": "text/html"});
            res.end(html);
        });
    }
}).listen(8080, ()=>{
    console.log("Server started at: http://localhost:8080");
})