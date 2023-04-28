const connection  = require('./connectivity');


connection.query("CREATE DATABASE nodedemo", (err, result) => {
    if (err) {
        console.log(`Problem In Connectivity ${err}`)
        return
    }
    console.log("✅ Database created");
});

connection.query("use nodedemo", (err, result) => {
    if (err) {
        console.log(`Problem In Connectivity ${err}`)
        return
    }
    console.log("✅ Database Selected");
});

const createSql = "CREATE TABLE customers (name VARCHAR(255), address VARCHAR(255))";
connection.query(createSql, (err, result) => {
    if (err) {
        console.log(`Problem In Connectivity ${err}`)
        return
    }
    console.log("✅ Table created");
});

const insertSql = "INSERT INTO customers (name, address) VALUES ('Company Inc', 'Highway 37')";
connection.query(insertSql, (err, result) => {
    if (err) {
        console.log(`Problem In Connectivity ${err}`)
        return
    }
    console.log("✅ 1 record inserted");
});

connection.query("SELECT * FROM customers", (err, result, fields) => {
    if (err) {
        console.log(`Problem In Connectivity ${err}`)
        return
    }
    console.log(result);
});

const updateSql = "UPDATE customers SET address = 'Canyon 123' WHERE address = 'Highway 37'";
connection.query(updateSql, (err, result) => {
    if (err) {
        console.log(`Problem In Connectivity ${err}`)
        return
    }
    console.log(result.affectedRows + " record(s) updated");
});

const deleteSql = "DELETE FROM customers WHERE address = 'pune'";
connection.query(deleteSql, (err, result) => {
    if (err) {
        console.log(`Problem In Connectivity ${err}`)
        return
    }
    console.log("Number of records deleted: " + result.affectedRows);
});