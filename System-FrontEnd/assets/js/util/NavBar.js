    /*for nav var*/
var manageCarSection = document.getElementById('manageCarSection');
var dashboardSection = document.getElementById('dashboardSection');
var registerCustomerSection = document.getElementById('registerCustomerSection');
var loginCustomerSection = document.getElementById('loginCustomerSection');


manageCarSection.style.display = "none";
registerCustomerSection.style.display = "none";
loginCustomerSection.style.display = "none";


var carBtn = document.getElementById('manageCar');
var dashboardBtn = document.getElementById('dashboard');
var registerCustomerBtn = document.getElementById('registerCustomer');

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
});
    registerCustomerBtn.addEventListener('click', function () {
        manageCarSection.style.display = "none";
        dashboardSection.style.display = "none";
        loginCustomerSection.style.display = "block";
        registerCustomerSection.style.display = "none";
});

    /*for dashboard*/
$( ".card" ).click(function() {
    $( this ).toggleClass( "selected" );
});
