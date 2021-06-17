var manageCarSection = document.getElementById('manageCarSection');
var dashboardSection = document.getElementById('dashboardSection');
var registerCustomerSection = document.getElementById('registerCustomerSection');
var loginCustomerSection = document.getElementById('loginCustomerSection');
var driverManageSection = document.getElementById('driverManageSection');
var loginDriverSection = document.getElementById('loginDriverSection');


manageCarSection.style.display = "none";
registerCustomerSection.style.display = "none";
loginCustomerSection.style.display = "none";
driverManageSection.style.display = "none";
loginDriverSection.style.display = "none";

var btnSign = document.getElementById('btnSign');
var btnLogin = document.getElementById('btnLogin');
var btnDriverSign = document.getElementById('btnDriverSign');
var btnDriverLogin = document.getElementById('btnDriverLogin');

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

btnDriverSign.addEventListener('click', function () {
    manageCarSection.style.display = "none";
    dashboardSection.style.display = "none";
    registerCustomerSection.style.display = "none";
    loginCustomerSection.style.display = "none";
    driverManageSection.style.display = "block";
    loginDriverSection.style.display = "none";

});
btnDriverLogin.addEventListener('click', function () {
    manageCarSection.style.display = "none";
    dashboardSection.style.display = "none";
    registerCustomerSection.style.display = "none";
    loginCustomerSection.style.display = "none";
    driverManageSection.style.display = "none";
    loginDriverSection.style.display = "block";

});