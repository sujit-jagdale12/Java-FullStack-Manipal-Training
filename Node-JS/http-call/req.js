const http = require('node:http')

const server = http.createServer((req, res) => {
    res.writeHead(201, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify({ sts : 'success', msg : 'Your request reached.' }))
})

server.listen(8080, '127.0.0.1', (err) => {
    if(err) {
        console.log(`❌ There is an error`)    
        console.log(err)
        return
    }
    console.log(`✅ Listening on 3000 port`)
})