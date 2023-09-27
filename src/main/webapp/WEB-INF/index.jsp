<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
<link rel="stylesheet" href="css/index.css">
</head>
<body>
    <header>
        <div id="logo">
           <img src="Images/marteau-logo-eni-noir" alt="Logo ENI-Enchères">	
       </div>
        <nav>
           <h1>ENI-Enchères</h1> 
           <a href="/connexionCreationCompte.jsp">S'inscrire - Se connecter</a>  
       </nav>
   </header>
   <main>
   <h2 class="titre secondaire">Liste des Enchères</h2>
       <section class="filtres">
           <h3>Filtres</h3>
           <form action="" method="get">
               <input type="text" name="text" class="search" placeholder="Le nom de l'article contient">
               <button type="submit">Q</button>
           </form>
       </section>
       <section class="categorie-container">
           <div class="menu-deroulant">
               <form action="" method="POST">
                   <label for="categorie">Catégorie :</label>
                   <input type ="text" list="listeChoix" name="categorie" id="categorie">
                    <datalist id="listeChoix">
                        <option value ="Informatique"></option>
                        <option value ="Ameublement"></option>
                        <option value ="Vêtements"></option>
                        <option value ="Sports & Loisirs"></option>
                    </datalist> 
                </form>
           </div>
       </section>
   </main>
</body>
</html>