@extends('layout')

@section('conteudo')

<div class="top-content">
    <div class="foto">
    </div>
    </div>
<div class="container">
<div class="panel panel-default">
<div class="panel-heading">
	<div>
		<img src="assets/ico/apple-touch-icon-72-precomposed.png"><br>
		<p><strong>Cadastro de Serviço</strong></p>
	</div>

</div>
	<div class="panel-body container-fluid">

	<form>
	<div class="row">
		<div class="form-group">
			<label id="teste1">Área: </label>
			<select class="form-control">
				<option>1</option>
				<option>2</option>
			</select>
		</div>
	</div>
	<div class="row">
		<div class="form-group">
			<label>Título: </label>
			<input type="text" name="" required="true" class="form-control">
		</div>
	</div>
	<div class="row">
		<div class="form-group">
			<label>Descrição: </label>
			<textarea cols="" rows="5" class="form-control"></textarea>
		</div>
	</div>
	<div class="form-inline">
			<div class="col-xs-3">
				<label>Forma de pagamento: </label>
			</div>
			<div class="col-xs-3 ">
				<label>Dinheiro: </label>
				<input type="radio" name="pagamento" value="dinheiro">
			</div>
			<div class="col-xs-3 ">
				<label>Cartão: </label>
				<input type="radio" name="pagamento" value="cartao">
			</div>
			<div class="col-xs-3 ">
				<label>Outros: </label>
				<input type="radio" name="pagamento" value="outros">
			</div>
	</div>
  <br><br>
		<!-- <hr> -->
		<h3><strong>Contato</strong></h3>
    <br>
		<div class="form-inline">
			<div class="col-xs-3" style="text-align: left !important;">
				<label>Adicionar imagem :</label>
			</div>
			<div class="col-xs-4">
				<input type="file" name="imagem">
			</div>
		</div>
    <br><br>
		<div class="form-inline" style="text-align: left !important;">
			<div class="col-xs-3">
				<label>Nome: </label><font class="nome"> Usuario da Silva</font>
			</div>
		</div>
		<div class="form-inline">
			<div class="col-xs-2">
				<label>Telefone de contato:</label>
			</div>
			<div class=" col-xs-3" style="text-align: left !important;">
				 &nbsp&nbsp&nbsp&nbsp<span class="glyphicon glyphicon-phone-alt" aria-hidden="true"></span><label class="telefone"> &nbsp279999999</label>
			</div>
			<div class=" col-xs-3" style="text-align: left !important;">
				&nbsp&nbsp<span class="glyphicon glyphicon-phone" aria-hidden="true"></span><label class="telefone"> &nbsp2799977777</label>
			</div>
		</div>
    <br><br>
    <div class="form-inline">
      <label>Os dados de contato podem ser alterados a qualquer momento no perfil do usuario</label>
    </div>

	</div>
		<hr>
		<div class="row">
			<button type="submit" class="primary btn" style="background-color: #f85e07; color: #ffffff">Salvar</button>
			<button class="btn btn-default">Cancelar</button>
		</div>
		<br>
	</form>
	</div>
	</div>
</div>

@endsection
