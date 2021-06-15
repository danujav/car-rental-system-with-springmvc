    /*for nav var*/
var manageCarSection = document.getElementById('manageCarSection');
var dashboardSection = document.getElementById('dashboardSection');

manageCarSection.style.display = "none";

var carBtn = document.getElementById('manageCar');
var dashboardBtn = document.getElementById('dashboard');

carBtn.addEventListener('click', function () {
    manageCarSection.style.display = "block";
    dashboardSection.style.display = "none";
});

dashboardBtn.addEventListener('click', function () {
    manageCarSection.style.display = "none";
    dashboardSection.style.display = "block";
});

    /*for dashboard*/
$( ".card" ).click(function() {
    $( this ).toggleClass( "selected" );
});
