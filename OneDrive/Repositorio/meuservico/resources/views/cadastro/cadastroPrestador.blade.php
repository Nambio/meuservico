@extends('layout')
@section('conteudo')

	<div class="top-content">
    <div class="foto">
    </div>
  </div>
	<br>
	<div class="row" style="margin-left: 3px; width: 98%; height:800px; background-color: white">
		<form class="">
			<div class="row">
				<div class="form-group col-xs-6" >
					<h4>Cadastre-se com seu e-mail</h4>
					<div class="espaco">
					</div>
				<div class="row">
						<div class="form-group col-xs-6">
								<input type="text" class="form-control " id="exampleInputEmail3" placeholder="Nome" required>
						</div>
						<div class="form-group col-xs-6">
								<input type="text" class="form-control" id="exampleInputPassword3" placeholder="Sobrenome" required>
						</div>
				</div>
				<div class="row">
						<div class="form-group col-xs-12">
							<input type="text" class="form-control" id="cpf" placeholder="CPF" required>
						</div>
				</div>
				<div class="row">
						<div class="form-group col-xs-6">
							<input type="text" class="form-control" id="endereco" placeholder="Endereço" required>
						</div>
						<div class="form-group col-xs-6">
							<input type="text" class="form-control" id="cep" placeholder="CEP" required>
						</div>
				</div>
				 <div class="row">
						<div class="form-group col-xs-12">
							<input type="text" class="form-control" id="cidade" placeholder="Cidade" required>
						</div>
				 </div>
				 <div class="row">
						<div class="form-group col-xs-12">
							<input type="text" class="form-control" id="bairro" placeholder="Bairro" required>
						</div>
				 </div>
				 <div class="row cadSexo">
						<label class="radio-inline" id="cadSexo">Sexo: &nbsp&nbsp&nbsp&nbsp</label>
						<label class="radio-inline">
							<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> Masculino
						</label>
						<label class="radio-inline">
							<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> Feminino
						</label>
						<label class="radio-inline">
							<input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> Outro
						</label>
				 </div>
				 <div class="row">
						<div class="form-group col-xs-12">
							<input type="email" class="form-control" id="email1" placeholder="E-mail" required>
						</div>
				 </div>
					<div class="row">
						<div class="form-group col-xs-12">
							<input type="email" class="form-control" id="email" placeholder="Confirmar e-mail" required>
						</div>
					</div>
					<div class="row">
						 <div class="form-group col-xs-12">
							<input type="password" class="form-control" id="senha" placeholder="Senha" required>
						</div>
					</div>
					<div class="checkbox">
						<label>
							<input type="checkbox" required> Concordo com o Termo de Privacidade
						</label>
					</div>
					<button type="submit" class="btn btn-warning btn-lg">Enviar</button>
			</form>
			<br>
			<a class="termo" href="#">Termo de Privacidade</a>

		</div>
		<div class="form-group col-xs-6">
			<h4>Cadastre-se com qualquer Mídia abaixo</h4>
			<div class="espaco">
			</div>
				<a href="#" class="btn btn-danger btn-lg active" role="button">Google</a>
				<a href="#" class="btn btn-primary btn-lg active" role="button">Facebook</a>
				<a href="#" class="btn btn-info btn-lg active"  role="button">Twitter</a>
		 </div>
	 </div>

@endsection
