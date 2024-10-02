var container = document.querySelector('.cordonee');

var inputs = document.querySelectorAll('.cordonee_inputs');
var labels = document.querySelectorAll('.cordonee_labels');
var inputemail = document.querySelector('#email');
var inputphone = document.querySelector('#telephon');

inputs.forEach((e) => {
    e.addEventListener('focus' , () => {

        e.closest('div').querySelector('label').classList.add('active');

    })


    if(e.value){
        e.closest('div').querySelector('label').classList.add('active');
    }


    e.addEventListener('blur' , () => {
        var label = e.closest('div').querySelector('label');

        if(label && !e.value){
            label.classList.remove('active');
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


