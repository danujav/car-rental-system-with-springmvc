
    $("#btnSignUp").click(function () {
        let custName = $("#custName").val();
        let custEmail = $("#custEmail").val();
        let custAddress = $("#custAddress").val();
        let custNum = $("#custNum").val();
        let nic = $("#nic").val();
        let custDrivingLicien = $("#custDrivingLicien").val();

        setLoginDetails();

       /* let formData = $("#formCustomer").serialize();*/
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


    function setLoginDetails() {
        let custEmail = $("#custEmail").val();
        let password = $("#password").val();

        $.ajax({
            method: "POST",
            url: "http://localhost:8080/backend/api/v1/login",
            contentType: 'application/json',
            async: true,
            data: JSON.stringify({
                email : custEmail,
                pw : password,
                status : "Customer",
            }),
            success: function (data) {
                console.log(data);
            }
        });
    }



    /*////////////////////*/
    /*for add photo*/
    /*for add NIC photo*/
    const wrapper2 = document.querySelector(".wrapper2");
    const fileName2 = document.querySelector(".file-name2");
    const defaultBtn2 = document.querySelector("#default-btn2");
    const customBtn2 = document.querySelector("#custom-btn2");
    const cancelBtn2 = document.querySelector("#cancel-btn2 i");
    const img2 = document.querySelector("img");
    let regExp2 = /[0-9a-zA-Z\^\&\'\@\{\}\[\]\,\$\=\!\-\#\(\)\.\%\+\~\_ ]+$/;
    function defaultBtnActive2(){
        defaultBtn2.click();
    }
    defaultBtn2.addEventListener("change", function(){
        const file = this.files[0];
        if(file){
            const reader = new FileReader();
            reader.onload = function(){
                const result = reader.result;
                img2.src = result;
                wrapper2.classList.add("active");
            }
            cancelBtn2.addEventListener("click", function(){
                img2.src = "";
                wrapper2.classList.remove("active");
            })
            reader.readAsDataURL(file);
        }
        if(this.value){
            let valueStore = this.value.match(regExp2);
            fileName2.textContent = valueStore;
        }
    });

    /*////////////////////*/
    /*for add photo*/
    /*for add Licien photo*/
    const wrapper3 = document.querySelector(".wrapper3");
    const fileName3 = document.querySelector(".file-name3");
    const defaultBtn3 = document.querySelector("#default-btn3");
    const customBtn3 = document.querySelector("#custom-btn3");
    const cancelBtn3 = document.querySelector("#cancel-btn3 i");
    const img3 = document.querySelector("img");
    let regExp3 = /[0-9a-zA-Z\^\&\'\@\{\}\[\]\,\$\=\!\-\#\(\)\.\%\+\~\_ ]+$/;
    function defaultBtnActive3(){
        defaultBtn3.click();
    }
    defaultBtn3.addEventListener("change", function(){
        const file = this.files[0];
        if(file){
            const reader = new FileReader();
            reader.onload = function(){
                const result = reader.result;
                img3.src = result;
                wrapper3.classList.add("active");
            }
            cancelBtn3.addEventListener("click", function(){
                img3.src = "";
                wrapper3.classList.remove("active");
            })
            reader.readAsDataURL(file);
        }
        if(this.value){
            let valueStore = this.value.match(regExp3);
            fileName3.textContent = valueStore;
        }
    });

