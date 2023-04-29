const mysql = require('mysql');

// Sometimes its not working use 
// ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';
// FLUSH PRIVILEGES;

const con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "root",
    // database:"nodedemo"
});

con.connect(function (err) {
    if (err) {
        console.log("Error in connectivity!"+err)
        return
    }
    console.log("Connected!");
});

module.exports=con;