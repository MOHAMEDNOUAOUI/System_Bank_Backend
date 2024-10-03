var container = document.querySelector('.cordonee');

var inputs = document.querySelectorAll('.cordonee_inputs');
var labels = document.querySelectorAll('.cordonee_labels');
var inputemail = document.querySelector('#email');
var inputphone = document.querySelector('#telephon');

inputs.forEach((e) => {
    e.addEventListener('focus' , () => {
        if(e.closest('div').querySelector('label').classList.contains('cordonee_labels_date')){
            e.closest('div').querySelector('label').classList.add('date');
        } else{
            e.closest('div').querySelector('label').classList.add('active');
        }


    })


    if(e.value){
        if(e.closest('div').querySelector('label').classList.contains('cordonee_labels_date')){
            e.closest('div').querySelector('label').classList.add('date');
        } else{
            e.closest('div').querySelector('label').classList.add('active');
        }
    }


    e.addEventListener('blur' , () => {
        var label = e.closest('div').querySelector('label');

        if(label && !e.value){
            label.classList.remove('active');
            label.classList.remove('date');
        }
    })
})


// inputemail.addEventListener('input' , () =>{
//     const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

//     const isValid = emailRegex.test(inputemail.value);

//     if(!isValid) {
//         document.querySelector()
//     }

// })


const nameInput = document.querySelector('#nom');
const prenomInput = document.querySelector('#Prenom');
const CINInput = document.querySelector('#CIN');
const dateNaissanceInput = document.querySelector('#datenaissance');
const dateEmbaucheInput = document.querySelector('#datedembauche');
const totalRevenueInput = document.querySelector('#totalrevenue');


var checker = document.querySelector('#mustbechecked');
var form = document.querySelector('form');

const nameRegex = /^[A-Za-z\s]{2,50}$/;
const CINRegex = /^[A-Z]{1,2}\d{5,6}$/;
const dateRegex = /^\d{2}\/\d{2}\/\d{4}$/;
const revenueRegex = /^\d+(\.\d{1,2})?$/;


document.querySelector('#LastconfirmButton').addEventListener('click' , function(e) {
    e.preventDefault();
    const { isValid, errorMessage } = validateForm();

    if(isValid){
        form.submit();
    }else{
        alert("Please correct the following errors:\n\n" + errorMessage);
    }

})




function validateForm() {
    let isValid = true;
    let errorMessage = "";

    if (!nameRegex.test(nameInput.value)) {
        isValid = false;
        errorMessage += "Invalid name format.\n";
    }

    if (!nameRegex.test(prenomInput.value)) {
        isValid = false;
        errorMessage += "Invalid first name format.\n";
    }

    if (!CINRegex.test(CINInput.value)) {
        isValid = false;
        errorMessage += "Invalid CIN format.\n";
    }

    if (!dateRegex.test(dateNaissanceInput.value)) {
        isValid = false;
        errorMessage += "Invalid date of birth format (YYYY-MM-DD).\n";
    }

    if (!dateRegex.test(dateEmbaucheInput.value)) {
        isValid = false;
        errorMessage += "Invalid hire date format (YYYY-MM-DD).\n";
    }

    if (!revenueRegex.test(totalRevenueInput.value)) {
        isValid = false;
        errorMessage += "Invalid total revenue format.\n";
    }

    if (!checker.checked) {
        isValid = false;
        errorMessage += "Please check the required checkbox.\n";
    }

    return { isValid, errorMessage };
}