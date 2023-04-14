function getAllAccounts() {
    fetch('http://localhost:8080/accounts/')
    .then( res => res.json() )
    .then(json => {
        console.log(json)
        console.log(json.bd)
        populateDataIntoTable(json.bd)
    })
}

function populateDataIntoTable(accounts) {
    const tableBody = document.getElementById("tbd");

        accounts.forEach(ac => {
            const newRow = tableBody.insertRow();

            const cell1 = newRow.insertCell(0);
            const cell2 = newRow.insertCell(1);
            const cell3 = newRow.insertCell(2);
            const cell4 = newRow.insertCell(3);

            cell1.innerHTML = ac.id;
            cell2.innerHTML = ac.owner;
            cell3.innerHTML = ac.balance;
            cell4.innerHTML=`
                            <td><button onclick="accounts/(${accounts.id})" >Edit</button></td>
                            <td><button onclick=accounts/(${accounts.id})" >Delete</button></td>`;
        });
}

getAllAccounts()