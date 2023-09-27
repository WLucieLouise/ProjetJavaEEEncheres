<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bienvenu</title>
<link rel="stylesheet" href="css/accueil.css">
</head>
<body>
    <header>
        <nav>
           <h1>ENI-Enchères</h1>
              <ul>
               <li><a href="">Enchères</a></li>
               <li><a href="">Vendre un article</a></li>
               <li><a href="">Mon profil</a></li>
               <li><a href="">Déconnexion</a></li>
           </ul>
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
           <div class="tabs">
               <input type="radio" id="achatTab" name="tabs" class="tab-input" checked>
               <label for="achatTab" class="tab-label">Achat</label>
               
               <input type="radio" id="venteTab" name="tabs" class="tab-input">
               <label for="venteTab" class="tab-label">Vente</label>
           </div>
       </section>
   </main>
</body>
</html>