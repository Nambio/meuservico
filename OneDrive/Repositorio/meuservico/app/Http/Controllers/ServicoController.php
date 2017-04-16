<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class ServicoController extends Controller
{
    public function funcao(){
    	return view('inicial');
    }
    public function cliente(){
    	return view('cadastro.cadastroPrestador');
    }
    public function servico(){
    	return view('cadastro.cadastroServico');
    }
}
