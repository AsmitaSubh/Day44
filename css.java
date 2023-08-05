html body {
    margin: 0;
    height: 100%;
}

.header {
    padding: 15px 0;
    background-color: #ffffff;
}

.header-content {
    display: flex;
    flex-direction: row;
    justify-content: center;
    align-items: center;
    border: 0px solid green;
}

.logo-content {
    display: flex;
    flex-direction: row;
    align-items: center;
    border: 0px solid green;
    width: 80%;
}

.logo-content-img {
    border: solid 0px #42515F;
}

.emp-text {
    font: normal normal bold 20px/25px Montserrat;
    font-family: "Montserrat", sans-serif;
    letter-spacing: 0px;
    color: #82a70c;
    text-transform: capitalize;
}

.emp-payroll {
    color: #42515f;
}

* {
    box-sizing: border-box;
}

.main-content {
    display: flex;
    flex-direction: column;
    min-height: calc(100vh - 80px);
    background-color: #f7f7f7;
    padding: 30px 0 10px;
    box-sizing: border-box;
}

.header-content {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;
    width: 80%;
    margin: 0 auto;
    padding: 25px;
}

.heading {
    font: normal normal bold 24px/25px Roboto;
    letter-spacing: 0px;
    color: #42515f;
    opacity: 1;
}

.emp-count {
    background-color: #82a70c;
    color: #ffffff;
    border-radius: 42%;
    font-size: 16px;
    width: 26px;
    text-align: center;
    display: inline-block;
}

.add-button {
    font: normal normal normal 22px/29px Roboto;
    color: #ffffff;
    letter-spacing: 0px;
    opacity: 1;
    background: #82a70c 0% 0% no-repeat padding-box;
    border: none;
    border-radius: 5px;
    padding: 5px 18px;
    outline: none;
    cursor: pointer;
    text-decoration: none;
}

.table-main {
    width: 80%;
    margin: 0 auto;
    overflow: auto;
}

.table {
    width: 100%;
    border-collapse: separate;
    border-spacing: 0 15px;
    min-width: 800px;
}

td,
th {
    text-align: left;
    padding: 5px 8px;
}

th {
    background: #42515F 0% 0% no-repeat padding-box;
    border-radius: 0px;
    opacity: 1;
    text-align: left;
    font: normal normal normal 14px/24px Roboto;
    color: #ffffff;
    letter-spacing: 0px;
    text-transform: uppercase;
    border: 0px solid #dddddd;
    padding: 8px;
}

tr:not(:first-child) {
    background: #ffffff 0% 0% no-repeat padding-box;
    border: 1px solid #e3e3e3;
    border-radius: 3px;
}

td {
    font: normal normal normal 14px/21px Roboto;
    letter-spacing: 0px;
    color: #3d3d3d;
    opacity: 1;
}

td:first-child {
    display: flex;
    align-items: center;
}

td img:first-child {
    margin-right: 10px;
}

td img {
    cursor: pointer;
}

.dept-label {
    background-color: #e9fea5;
    border-radius: 40%;
    width: fit-content;
    padding: 1px 7px;
    text-align: center;
    font-size: 14px;
    display: inline-block;
    font-weight: 300;
    margin-bottom: 8px;
}
