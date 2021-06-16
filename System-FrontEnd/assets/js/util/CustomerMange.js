
    $("#btnSignUp").click(function () {
        let custName = $("#custName").val();
        let custEmail = $("#custEmail").val();
        let custAddress = $("#custAddress").val();
        let custNum = $("#custNum").val();
        let nic = $("#nic").val();
        let custDrivingLicien = $("#custDrivingLicien").val();

        let formData = $("#formCustomer").serialize();
        alert("sdfsd")
        $.ajax({
            method: "POST",
            url: "http://localhost:8080/backend/api/v1/customer",
            contentType: 'application/json',
            async: true,
            data: JSON.stringify({
                custEmail : custEmail,
                custName : custName,
                custAddress : custAddress,
                custContactNumber : custNum,
                custNIC : nic,
                custDrivingLicien : custDrivingLicien
            }),
            success: function (data) {
                console.log(data);
            }
        });
    });

