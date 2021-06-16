var manageCarSection = document.getElementById('manageCarSection');
var dashboardSection = document.getElementById('dashboardSection');
var registerCustomerSection = document.getElementById('registerCustomerSection');
var loginCustomerSection = document.getElementById('loginCustomerSection');


manageCarSection.style.display = "none";
registerCustomerSection.style.display = "none";
loginCustomerSection.style.display = "none";

var btnSign = document.getElementById('btnSign');
var btnLogin = document.getElementById('btnLogin');

btnSign.addEventListener('click', function () {
    manageCarSection.style.display = "none";
    dashboardSection.style.display = "none";
    registerCustomerSection.style.display = "block";
    loginCustomerSection.style.display = "none";
});

btnLogin.addEventListener('click', function () {
    manageCarSection.style.display = "none";
    dashboardSection.style.display = "none";
    registerCustomerSection.style.display = "none";
    loginCustomerSection.style.display = "block";
});