$("#btnDriverSignUp").click(function () {
    let driverName = $("#driverName").val();
    let driverEmail = $("#driverEmail").val();
    let driverAddress = $("#driverAddress").val();
    let driverAge = $("#driverAge").val();
    let driverContactNumber = $("#driverContactNumber").val();

    setLoginDetails();

    /*let formData = $("#formCustomer").serialize();*/
    $.ajax({
        method: "POST",
        url: "http://localhost:8080/backend/api/v1/driver",
        contentType: 'application/json',
        async: true,
        data: JSON.stringify({
            driverEmail : driverEmail,
            name : driverName,
            age : driverAge,
            address : driverAddress,
            driverContactNumber : driverContactNumber,
        }),
        success: function (data) {
            console.log(data);
        }
    });
});

function setLoginDetails() {
    let driverPassword = $("#driverPassword").val();
    let driverEmail = $("#driverEmail").val();

    $.ajax({
        method: "POST",
        url: "http://localhost:8080/backend/api/v1/login",
        contentType: 'application/json',
        async: true,
        data: JSON.stringify({
            email : driverEmail,
            pw : driverPassword,
            status : "Driver",
        }),
        success: function (data) {
            console.log(data);
        }
    });
}