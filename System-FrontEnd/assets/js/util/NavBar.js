    /*for nav var*/
var manageCarSection = document.getElementById('manageCarSection');
var dashboardSection = document.getElementById('dashboardSection');
var registerCustomerSection = document.getElementById('registerCustomerSection');
var loginCustomerSection = document.getElementById('loginCustomerSection');
var driverManageSection = document.getElementById('driverManageSection');
var loginDriverSection = document.getElementById('loginDriverSection');btnDriverSign



manageCarSection.style.display = "none";
registerCustomerSection.style.display = "none";
loginCustomerSection.style.display = "none";
driverManageSection.style.display = "none";
loginDriverSection.style.display = "none";


var carBtn = document.getElementById('manageCar');
var dashboardBtn = document.getElementById('dashboard');
var registerCustomerBtn = document.getElementById('registerCustomer');
var btnRegisterDriver = document.getElementById('registerDriver');



carBtn.addEventListener('click', function () {
    manageCarSection.style.display = "block";
    dashboardSection.style.display = "none";
    registerCustomerSection.style.display = "none";
    loginCustomerSection.style.display = "none";
});

dashboardBtn.addEventListener('click', function () {
    manageCarSection.style.display = "none";
    registerCustomerSection.style.display = "none";
    loginCustomerSection.style.display = "none";
    dashboardSection.style.display = "block";
    loginCustomerSection.style.display = "none";
    loginDriverSection.style.display = "none";
});
registerCustomerBtn.addEventListener('click', function () {
    manageCarSection.style.display = "none";
    dashboardSection.style.display = "none";
    loginCustomerSection.style.display = "block";
    registerCustomerSection.style.display = "none";
    loginDriverSection.style.display = "none";
});
btnRegisterDriver.addEventListener('click', function () {
        manageCarSection.style.display = "none";
        dashboardSection.style.display = "none";
        loginDriverSection.style.display = "block";
        registerCustomerSection.style.display = "none";
        loginCustomerSection.style.display = "none";
});



    /*for dashboard*/
$( ".card" ).click(function() {
    $( this ).toggleClass( "selected" );
});
