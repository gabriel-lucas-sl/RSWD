<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Exercício 1</title>
	
	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="./css/bootstrap.css" type="text/css">
	
	</head>
	<body>
		
		<div>
			
			
		</div>
		
		<section>
			<form action="cliente" method="POST"> 
				<fieldset>
					<legend>Cadastro de Clientes</legend>
					<div class="form-group">
						<label class="control-label col-sm-4" for="idNm">Nome</label>
						<div class="col-sm-8">
							<input type="text" name="txtNm" id="idNm" class="form-control" 
								placeholder="Digite o seu nome." required="required">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-4" for="idSnm">Sobrenome</label>
						<div class="col-sm-8">
							<input type="text" name="txtSnm" id="idSnm" class="form-control" 
								placeholder="Digite o seu sobrenome." required="required">
						
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-4" for="idDtNasc">Data Nascimento</label>
						<div class="col-sm-8">
							<input type="date" name="txtDtNasc" id="idDtNasc" class="form-control" required="required">
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-4" for="idGen">Gênero</label>
						<div class="col-sm-8">
							<select name="txtGen" class="form-control" required="required">
								<option value="0" selected="selected">Selecione sua opção</option>
								<option value="m">Masculino</option>
								<option value="m">Feminino</option>
								<option value="m">Outros</option>
							</select>
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-4" for="idTel">Telefone</label>
						<div class="col-sm-8">
							<input type="tel" name="txtTel" id="idTel" class="form-control" 
								placeholder="(11) 11111-1111" required="required" maxlength="15"
								pattern="\([0-9]{2}\) [0-9]{4,6}-[0-9]{3,4}$">
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button tyoe="submit" class="btn btn-success btn-lg">Cadastrar</button>
						</div>
						
					</div>
					
				</fieldset>
			</form>
		
			<figure>
								<!-- E aqui adicionamos os atributos enviados pela Servlet, os atributos criados no Request -->
								<!-- Recuperamos com Scriptlets ou Expressions, no caso aqui estamos recuperando com expression -->
								<!-- As expression apenas funcionam com métodos que retornam informações.-->
				<img alt="" width="<%=request.getAttribute("attrWidImg")%>" title="" src="<%=request.getAttribute("attrSrcImg")%>">
				<figcaption></figcaption>
				
			</figure>
		</section>
		
		<footer>
		
		</footer>
		
		<script type="text/javascript" src="./js/jquery-3.5.1.min.js"></script>
		<script type="text/javascript" src="./js/bootstrap.js"></script>
	</body>
</html>