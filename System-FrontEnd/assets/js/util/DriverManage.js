$("#btnDriverSignUp").click(function () {
    let driverName = $("#driverName").val();
    let driverEmail = $("#driverEmail").val();
    let driverAddress = $("#driverAddress").val();
    let driverAge = $("#driverAge").val();
    let driverContactNumber = $("#driverContactNumber").val();

    let formData = $("#formCustomer").serialize();
    alert("sdfsd")
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
