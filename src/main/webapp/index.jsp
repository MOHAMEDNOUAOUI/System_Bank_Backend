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
            <div class="NumbersPickers first active" onclick="goToSection(this,1)">
                <h2>1 <span>Simuler mon crédit</span></h2>
            </div>
            <div class="NumbersPickers second" onclick="goToSection(this,2)">
                <h2>2 <span>Mes coordonnées</span></h2>
            </div>
            <div class="NumbersPickers last" onclick="goToSection(this,3)">
                <h2>3 <span>Mes infos personnelles</span></h2>
            </div>
        </div>


        <form action="${pageContext.request.contextPath}/demande-controller" class="leftcontainer-bottomcontainer" method="POST">

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
                    <input name="montant" type="text" value="5000" id="montant_endh_text_aread" class="inputcontainer_input">
                    <input type="range" class="rangeinputs" id="montant_range" min="5000" max="400000" value="10000">
                </div>

                <div class="duree inputcontainer">
                    <label for="dure">Durée (en mois)</label>
                    <input name="dure" type="text" value="24" id="dure" class="inputcontainer_input">
                    <input type="range" class="rangeinputs" min="0" value="0" max="" step="1">
                </div>

                <div class="mensualite inputcontainer">
                    <label for="mensualite">Mensualités (en DH)</label>
                    <input name="mensualite" type="text" id="mensualite" class="inputcontainer_input">
                    <input type="range" id="mensualite_range" min="0" value="0" max="" class="rangeinputs">
                </div>





                <button type="button"  id="firstconfirmButton" onclick="nextSection(2)">
                    Continuer <span>Sans engagement</span>
                </button>



            </div>


            <div class="cordonee">

                <div class="email allays">
                    <label for="email" class="cordonee_labels">Email</label>
                    <input name="email" type="email" class="cordonee_inputs" id="email">
                </div>

                <div class="telephone allays">
                    <label for="telephon" class="cordonee_labels">Telephon</label>
                    <input name="telephon" type="text" class="cordonee_inputs" id="telephon">
                </div>


                <button type="button" id="secondconfirmButton" onclick="nextSection(3)"> Continuer <span>Sans engagement</span></button>

            </div>


            <div class="personnel">
                <div class="civilite">
                    <h2 id="civiliteh2">Civilité</h2>

                    <div class="radios">


                        <div class="radio">
                            <input name="civilite" id="radio-1" value="Madame" name="radio" type="radio" checked>
                            <label for="radio-1" class="radio-label">Madame</label>
                        </div>

                        <div class="radio">
                            <input name="civilite" id="radio-2" value="Mademoiselle" name="radio" type="radio" checked>
                            <label for="radio-2" class="radio-label">Mademoiselle</label>
                        </div>

                        <div class="radio">
                            <input name="civilite" value="Monsieur" id="radio-3" name="radio" type="radio" checked>
                            <label for="radio-3" class="radio-label">Monsieur</label>
                        </div>

                    </div>
                </div>

                <div class="fullinputs">

                    <div class="Nom allays">
                        <label for="nom" class="cordonee_labels">Nom</label>
                        <input name="nom" type="text" class="cordonee_inputs" id="nom">
                    </div>

                    <div class="Prenom allays">
                        <label for="Prenom" class="cordonee_labels">Prenom</label>
                        <input name="prenom" type="text" class="cordonee_inputs" id="Prenom">
                    </div>

                    <div class="CIN allays">
                        <label for="CIN" class="cordonee_labels">Numero CIN / Carte de sejour</label>
                        <input name="CIN" type="text" class="cordonee_inputs" id="CIN">
                    </div>

                    <div class="DateDeNaissance allays">
                        <label for="datenaissance" class="cordonee_labels_date">Date de naissance</label>
                        <input name="datenaissance" type="text" class="cordonee_inputs" id="datenaissance" placeholder="JJ/MM/YYYY">
                    </div>

                    <div class="DateDembauche allays">
                        <label for="datedembauche" class="cordonee_labels_date">Date d'embauche/debut de l'activite</label>
                        <input name="DateDembauche" type="text" class="cordonee_inputs" id="datedembauche" placeholder="JJ/MM/YYYY">
                    </div>

                    <div class="totalrevenue allays">
                        <label for="totalrevenue" class="cordonee_labels">Total revenues mensuels (net en DH)</label>
                        <input name="totalrevenue" type="text" class="cordonee_inputs" id="totalrevenue">
                    </div>

                    <div class="checking">
                        <p>Avez vous des credits en cours?</p>
                    </div>

                    <div class="captcha">
                        <input type="checkbox" id="mustbechecked">
                        <p>J'ai lu et j'accepte les conditions générales d'utilisation figurant sur les informations légales,
                            notamment la mention relative à la protection des données personnelles</p>
                    </div>


                    <button type="submit" id="LastconfirmButton"> Demande ce credit </button>

                </div>


            </div>




        </form>
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