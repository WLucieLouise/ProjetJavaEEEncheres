<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Mon profil</h1>

<p>Pseudo : ${ utilisateur.pseudo }</p>
<p>Nom et prénom : ${ utilisateur.nom } ${ utilisateur.prenom }</p>
<p>Email : ${ utilisateur.email }</p>
<p>Téléphone : ${ utilisateur.telephone }</p>
<p>Adresse : ${ utilisateur.rue }, ${ utilisateur.code_postal } ${ utilisateur.ville }</p>
<p>Mot de passe : ${ utilisateur.mot_de_passe }</p>

<p>Nombre de points : ${ utilisateur.points }</p>

<p><a href="modifierProfilUtilisateur">Modifier</a></p>

</body>
</html>