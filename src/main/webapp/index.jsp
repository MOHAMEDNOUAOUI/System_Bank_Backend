<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet"  href="./css/style.css">
    <title>Document</title>
</head>


<body>

<div class="container">
    <div class="leftcontainer">

        <div class="leftcontainer-topcontainer">
            <div class="NumbersPickers first active" onclick="goToSection(1)">
                <h2>1 <span>Simuler mon crédit</span></h2>
            </div>
            <div class="NumbersPickers second" onclick="goToSection(2)">
                <h2>2 <span>Mes coordonnées</span></h2>
            </div>
            <div class="NumbersPickers last" onclick="goToSection(3)">
                <h2>3 <span>Mes infos personnelles</span></h2>
            </div>
        </div>

        <div class="leftcontainer-bottomcontainer">

            <div class="Simuler">

                <div class="monproject inputcontainer">
                    <label for="monproject">Mon projet</label>
                    <select name="monproject" id="monproject">
                        <option value="J'ai besoin d'argent">J'ai besoin d'argent</option>
                        <option value="Je finance mon véhicule d'occasion">Je finance mon véhicule d'occasion</option>
                        <option value="Je Gère mes omprévus">Je Gère mes omprévus</option>
                        <option value="Je finance mon véhicule neuf">Je finance mon véhicule neuf</option>
                        <option value="J'équipe ma maison">J'équipe ma maison</option>
                    </select>
                </div>


                <div class="jesuis inputcontainer">
                    <label for="jesuis_select">Je suis</label>
                    <select name="jesuis_select" id="jesuis_select">
                        <option value="Salarié du secteur privé">Salarié du secteur privé</option>
                        <option value="Fonctionnaire">Fonctionnaire</option>
                        <option value="Profession libérale">Profession libérale</option>
                        <option value="Commerçant">Commerçant</option>
                        <option value="Artisan">Artisan</option>
                        <option value="Retraité">Retraité</option>
                        <option value="Autre professions">Autre professions</option>
                    </select>
                </div>


                <div class="montant inputcontainer">
                    <label for="MontantEnDh">Montant (en DH)</label>
                    <input type="text" value="5000" id="montant_endh_text_aread" class="inputcontainer_input">
                    <input type="range" class="rangeinputs" id="montant_range" min="5000" max="400000" value="10000">
                </div>

                <div class="duree inputcontainer">
                    <label for="dure">Durée (en mois)</label>
                    <input type="text" value="24" id="dure" class="inputcontainer_input">
                    <input type="range" class="rangeinputs" min="0" value="0" max="" step="1">
                </div>

                <div class="mensualite inputcontainer">
                    <label for="mensualite">Mensualités (en DH)</label>
                    <input type="text" id="mensualite" class="inputcontainer_input">
                    <input type="range" id="mensualite_range" min="0" value="0" max="" class="rangeinputs">
                </div>





                <button  id="firstconfirmButton" onclick="nextSection(2)">
                    Continuer <span>Sans engagement</span>
                </button>



            </div>


            <div class="cordonee">

                <div class="email allays">
                    <label for="email" class="cordonee_labels">Email</label>
                    <input type="email" class="cordonee_inputs" id="email">
                </div>

                <div class="telephone allays">
                    <label for="telephon" class="cordonee_labels">Telephon</label>
                    <input type="text" class="cordonee_inputs" id="telephon">
                </div>


                <button id="secondconfirmButton" onclick="nextSection(3)"> Continuer <span>Sans engagement</span></button>

            </div>


            <div class="personnel">
                <div class="civilite">
                    <h2>Civilité</h2>

                    <div class="radios">


                        <div class="radio">
                            <input id="radio-1" name="radio" type="radio" checked>
                            <label for="radio-1" class="radio-label">Madame</label>
                        </div>

                        <div class="radio">
                            <input id="radio-2" name="radio" type="radio" checked>
                            <label for="radio-2" class="radio-label">Mademoiselle</label>
                        </div>

                        <div class="radio">
                            <input id="radio-3" name="radio" type="radio" checked>
                            <label for="radio-3" class="radio-label">Monsieur</label>
                        </div>

                    </div>

                </div>
            </div>





        </div>
    </div>




    <div class="rightcontainer">
        <h2 id="recaptulatif">Mon récapitulatif</h2>

        <div class="project">
            <h2 id="monproject">Mon projet</h2>
        </div>

        <div class="pretpersonel">
            <h2 id="pret">Prêt Personnel</h2>
        </div>


    </div>




</div>

</body>


<script src="./js/javascript.js"></script>
<script src="./js/SecondPage.js"></script>
</html>