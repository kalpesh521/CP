
//  https://www.guru99.com/node-js-create-server-get-data.html
var http=require('http')
var server=http.createServer((function(request,response)
{
	response.writeHead(200,
	{"Content-Type" : "text/plain"});
	response.end("Hello from kalpesh\n");
}));
server.listen(8000,()=>{
    console.log("Server is running on port 8000");
});