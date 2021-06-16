    /*for add photo*/
const wrapper = document.querySelector(".wrapper");
const fileName = document.querySelector(".file-name");
const defaultBtn = document.querySelector("#default-btn");
const customBtn = document.querySelector("#custom-btn");
const cancelBtn = document.querySelector("#cancel-btn i");
const img = document.querySelector("img");
let regExp = /[0-9a-zA-Z\^\&\'\@\{\}\[\]\,\$\=\!\-\#\(\)\.\%\+\~\_ ]+$/;
function defaultBtnActive(){
    defaultBtn.click();
}
defaultBtn.addEventListener("change", function(){
    const file = this.files[0];
    if(file){
        const reader = new FileReader();
        reader.onload = function(){
            const result = reader.result;
            img.src = result;
            wrapper.classList.add("active");
        }
        cancelBtn.addEventListener("click", function(){
            img.src = "";
            wrapper.classList.remove("active");
        })
        reader.readAsDataURL(file);
    }
    if(this.value){
        let valueStore = this.value.match(regExp);
        fileName.textContent = valueStore;
    }
});
    /*==============================================================*/
    /*for save button*/

    $( "#btnSave" ).click(function() {
        saveCar();

        var fileObject = $("#default-btn")[0].files[0];//access file object from input field
        var fileName = $("#default-btn")[0].files[0].name; //get file name
        var data = new FormData(); //setup form data object to send file data
        data.append("car-pic", fileObject, fileName); //append data
        $.ajax({
            method: 'POST',
            url: 'http://localhost:8080/backend/api/v1/car/file',
            async: false,
            processData: false, //stop processing data of request body
            contentType: false, // stop setting content type by jQuery
            data: data,
            success: function () {
                alert("File Uploaded");
            }
        });
        alert("He")

    });

    function saveCar() {
        let carReg = $("#carReg").val();
        let brand = $("#brand").val();
        let color = $("#color").val();
        let qty = $("#qty").val();
        let dailyRate = $("#dailyRate").val();
        let extraPriceForKM = $("#extraPriceForKM").val();
        let freeMileageForPrice = $("#freeMileageForPrice").val();
        let fuelType = $("#fuelType").val();
        let monthlyRate = $("#monthlyRate").val();
        let noOfPassenger = $("#noOfPassenger").val();
        let transmissionType = $("#transmissionType").val();
        let ldw = $("#ldw").val();
        let type = $("#type").val();
        $.ajax({
            method: "POST",
            url: "http://localhost:8080/backend/api/v1/car",
            contentType: 'application/json',
            async: true,
            data: JSON.stringify({
                regNumber : carReg,
                loose : ldw,
                brand : brand,
                type : type,
                noOfPassenger : noOfPassenger,
                transmissionOnType : transmissionType,
                fuelType : fuelType,
                dailyRate : dailyRate,
                monthlyRate : monthlyRate,
                freeMileageForPrice : freeMileageForPrice,
                extraPriceForKM : extraPriceForKM,
                color : color,
                carQty : qty,
                /*LDWCost : ldw,*/
                /*avStatus : "available"*/
            }),
            success: function (data) {
                console.log(data);
            }
        });
    }
