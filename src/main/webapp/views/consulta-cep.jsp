<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="UTF-8" />
<title>Consulta CEP</title>
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
<style>
	span.error {color: red;}
</style>	

</head>
<body>

	<nav class="navbar bg-light navbar-light"></nav>

	<form:form class="form-horizontal" method="post" action="/despesa/util/cep" modelAttribute="localidade">
		<div class="card">
			<div class="card-header">
				<div class="clearfix">
	   				<h4 class="card-title impacta-titulo-panel"> Consulta de CEP
	   				<a class="btn btn-link float-right" 
							href="/logout">Logout</a>
							</h4>
	   			</div>
			</div>
			<div class="card-body">
				
				<div class="form-group">
					<label for="moeda" class="col-sm-2 control-label">CEP</label>
					<div class="col-sm-2">
						<form:input class="form-control" path="cep"/>
					</div>
				</div>

				<div class="form-group">
					<label for="endereco" class="col-sm-4 control-label">endereco</label>
					<div class="col-sm-4">
						<form:input disabled="true" class="form-control" path="endereco"/>
					</div>
				</div>
				
				<div class="form-group">
					<label for="bairro" class="col-sm-4 control-label">bairro</label>
					<div class="col-sm-4">
						<form:input disabled="true" class="form-control" path="bairro"/>
					</div>
				</div>

				<div class="form-group">
					<label  for="cidade" class="col-sm-4 control-label">Cidade</label>
					<div class="col-sm-4">
						<form:input disabled="true" class="form-control" path="cidade"/>
					</div>
				</div>

				<div class="form-group">
					<label  for="estado" class="col-sm-4 control-label">Estado</label>
					<div class="col-sm-4">
						<form:input disabled="true" class="form-control" path="estado"/>
					</div>
				</div>
				<div class="form-group">

					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-primary">Consultar</button>
					</div>
				</div>
			</div>
		</div>
	</form:form>
	<script src="/js/jquery-3.1.1.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/jquery.maskMoney.min.js"></script>
	<script src="/js/despesas.js"></script>
</body>
</html>