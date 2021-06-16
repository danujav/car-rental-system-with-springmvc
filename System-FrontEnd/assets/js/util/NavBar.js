    /*for nav var*/
var manageCarSection = document.getElementById('manageCarSection');
var dashboardSection = document.getElementById('dashboardSection');
var registerCustomerSection = document.getElementById('registerCustomerSection');


manageCarSection.style.display = "none";
registerCustomerSection.style.display = "none";

var carBtn = document.getElementById('manageCar');
var dashboardBtn = document.getElementById('dashboard');
var registerCustomerBtn = document.getElementById('registerCustomer');

carBtn.addEventListener('click', function () {
    manageCarSection.style.display = "block";
    dashboardSection.style.display = "none";
    registerCustomerSection.style.display = "none";
});

dashboardBtn.addEventListener('click', function () {
    manageCarSection.style.display = "none";
    registerCustomerSection.style.display = "none";
    dashboardSection.style.display = "block";
});
    registerCustomerBtn.addEventListener('click', function () {
        manageCarSection.style.display = "none";
        dashboardSection.style.display = "none";
        registerCustomerSection.style.display = "block";
});

    /*for dashboard*/
$( ".card" ).click(function() {
    $( this ).toggleClass( "selected" );
});
