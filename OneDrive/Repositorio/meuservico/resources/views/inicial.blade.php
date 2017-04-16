@extends('layout')
@section('conteudo')
      <!-- Loader -->
    <div class="loader">
      <div class="loader-img"></div>
    </div>
      <!-- Top content -->
      <div class="top-content">

          <div class="inner-bg">
              <div class="container">

                  <div class="row">
                      <div class="col-sm-8 col-sm-offset-2 text">
                      	<div class="logo wow fadeInDown">
                      		<a href="index.html"></a>
                      	</div>
                          <h1 class="wow fadeInLeftBig">Precisando de um serviço e não encontrou nenhum profissional?</h1>
                          <div class="description wow fadeInLeftBig">
                          	<p>
                            	Contrate serviços diretamente com os profissionais sem nenhuma burocracia!!
                          	</p>
                          </div>
                          <div class="top-big-link wow fadeInUp">
                          	<a href="#" class="btn btn-link-1">Procurar serviços</a>
                          	<a href="#janela2" rel="modal" class="btn btn-link-2 scroll-link">Cadastrar um Serviço</a>
                          </div>
                      </div>
                  </div>
              </div>
          </div>
      </div>

      <!-- Services -->
      <div class="services-container section-container">
        <div class="container">
            <div class="row">
                <div class="col-sm-12 services section-description wow fadeIn">
                    <h2>Alguns dos serviços que você encontra no site</h2>
                    <div class="divider-1 wow fadeInUp"><span></span></div>
                </div>
            </div>
            <div class="row">
              	<div class="col-sm-4 services-box wow fadeInUp">
              		<div class="row">
              			<div class="col-sm-4">
		                	<div class="services-box-icon">
		                		<i class="fa fa-cog"></i>
		                	</div>
	                	</div>
                		<div class="col-sm-8">
                    		<h3>Construção Civíl</h3>
                    		<p>Contrate um pedreiro, ajudante de obras, arquiteto ou até mesmo um engenheiro. Basta realizar a busca pelos
                          filtros desejados.
                        </p>
                    	</div>
                    </div>
                  </div>
                  <div class="col-sm-4 services-box wow fadeInDown">
                	<div class="row">
              			<div class="col-sm-4">
		                	<div class="services-box-icon">
                        <i class="fa fa-magic"></i>
		                	</div>
	                	</div>
                		<div class="col-sm-8">
                    		<h3>Diarista</h3>
                    		<p>Precisa dar aquela faxina em sua residência? É fácil, encontre diversos profissionais com uma rápida pesquisa</p>
                    	</div>
                    </div>
                  </div>
                  <div class="col-sm-4 services-box wow fadeInUp">
                	<div class="row">
              			<div class="col-sm-4">
		                	<div class="services-box-icon">
		                		<i class="fa fa-fire"></i>
		                	</div>
	                	</div>
                		<div class="col-sm-8">
                    		<h3>Desenvolvimento</h3>
                    		<p>Encontre web design, programadores C#, PHP, JAVA e diversos outros profissionais desenvolvedores com apenas alguns
                        clicks.
                       </p>
                    	</div>
                    </div>
                  </div>
            </div>
        </div>
      </div>

      <!-- Great support -->
      <div class="great-support-container section-container section-container-gray-bg">
        <div class="container">
            <div class="row">
                <div class="col-sm-12 great-support section-description wow fadeIn">
                </div>
            </div>
            <div class="row">
            	<div class="col-sm-7 great-support-box wow fadeInLeft">
                    <div class="great-support-box-text great-support-box-text-left">
                    	<h3>Use também no celular!</h3>
                    	<p class="medium-paragraph">
                        Mesmo com a correria do dia dia não podemos deixar de estar conectado.

                    	</p>
                    	<p>
                    		Para facilitar a vida dos usuários, o Meu Serviço dispõe de uma tecnologia que deixa a utilização
                        do site no celular muito mais fácil. Assim, você não perde nem um segundo se quer, podendo contratar um novo
                        serviço a qualquer hora e lugar. Ou caso seja um prestador, você também pode cadastrar um novo serviço ou
                        fechar um acordo com algum cliente com toda a facilidade de um smartphone.
                    	</p>
                    	<p>
                    		Logo o Meu Serviço estará disponível também para android e IOS nativo.
                    	</p>
                    </div>
                </div>
                <div class="col-sm-5 great-support-box great-support-box-phone wow fadeInUp">
                    <img src="assets/img/devices/iphone.png" alt="">
                </div>
            </div>
        </div>
      </div>

      <!-- Testimonials -->
      <div class="testimonials-container section-container section-container-image-bg">
        <div class="container">
            <div class="row">
                <div class="col-sm-12 testimonials section-description wow fadeIn">
                </div>
            </div>
            <div class="row">
                <div class="col-sm-10 col-sm-offset-1 testimonial-list wow fadeInUp">
                	<div role="tabpanel">
                		<!-- Tab panes -->
                		<div class="tab-content">
                			<div role="tabpanel" class="tab-pane fade in active" id="tab1">
                				<div class="testimonial-image">
                					<img src="assets/img/testimonials/1.jpg" alt="" data-at2x="assets/img/testimonials/1.jpg">
                				</div>
                				<div class="testimonial-text">
	                                <p>
                                    "Utilizei o serviço para contratar um pedreiro para uma pequena obra em minha residência, foi excelente
                                    o serviço prestado, sem falar que foi rápido encontrar um profissional próximo, pois necessitava de certa
                                    urgência e o site foi de grande ajuda!"<br>
	                                </p>
                                </div>
                			</div>
                			<div role="tabpanel" class="tab-pane fade" id="tab2">
                				<div class="testimonial-image">
                					<img src="assets/img/testimonials/2.jpg" alt="" data-at2x="assets/img/testimonials/2.jpg">
                				</div>
                				<div class="testimonial-text">
	                                <p>
		                                	"Utilizei o serviço para contratar um pedreiro para uma pequena obra em minha residência, foi excelente
                                      o serviço prestado, sem falar que foi rápido encontrar um profissional próximo, pois necessitava de certa
                                      urgência e o site foi de grande ajuda!"<br>
	                                </p>
                                </div>
                			</div>
                			<div role="tabpanel" class="tab-pane fade" id="tab3">
                				<div class="testimonial-image">
                					<img src="assets/img/testimonials/3.jpg" alt="" data-at2x="assets/img/testimonials/3.jpg">
                				</div>
                				<div class="testimonial-text">
	                                <p>
                                      "Utilizei o serviço para contratar um pedreiro para uma pequena obra em minha residência, foi excelente
                                      o serviço prestado, sem falar que foi rápido encontrar um profissional próximo, pois necessitava de certa
                                      urgência e o site foi de grande ajuda!"<br>
	                                </p>
                                </div>
                			</div>
                			<div role="tabpanel" class="tab-pane fade" id="tab4">
                				<div class="testimonial-image">
                					<img src="assets/img/testimonials/4.jpg" alt="" data-at2x="assets/img/testimonials/4.jpg">
                				</div>
                				<div class="testimonial-text">
	                                <p>
                                      "Utilizei o serviço para contratar um pedreiro para uma pequena obra em minha residência, foi excelente
                                      o serviço prestado, sem falar que foi rápido encontrar um profissional próximo, pois necessitava de certa
                                      urgência e o site foi de grande ajuda!"<br>
	                                </p>
                                </div>
                			</div>
                		</div>
                		<!-- Nav tabs -->
                		<ul class="nav nav-tabs" role="tablist">
                			<li role="presentation" class="active">
                				<a href="#tab1" aria-controls="tab1" role="tab" data-toggle="tab"></a>
                			</li>
                			<li role="presentation">
                				<a href="#tab2" aria-controls="tab2" role="tab" data-toggle="tab"></a>
                			</li>
                			<li role="presentation">
                				<a href="#tab3" aria-controls="tab3" role="tab" data-toggle="tab"></a>
                			</li>
                			<li role="presentation">
                				<a href="#tab4" aria-controls="tab4" role="tab" data-toggle="tab"></a>
                			</li>
                		</ul>
                	</div>
                </div>
            </div>
        </div>
      </div>

      <div id="janela1" class="window">
        <a href="#" class="fechar">X Fechar</a>
        <form class="form-horizontal" data-toggle="validator" role="form">
          <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">Nome</label>
            <div class="col-sm-10">
              <input type="email" class="inputCaixa" id="inputNome" placeholder="Nome Completo ">
            </div>
          </div>
          <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
            <div class="col-sm-10">
              <input type="email" class="inputCaixa" id="inputEmai" placeholder="meu@email.com">
            </div>
          </div>
          <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">Senha</label>
            <div class="col-sm-10">
              <input type="password" class="inputCaixa" id="inputPassword" placeholder="Password">
            </div>
          </div>
          <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
              <div class="checkbox">
                <label>
                  <input type="checkbox"> Me lembre
                </label>
              </div>
            </div>
          </div>
          <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
              <button type="submit" class="btn btn-default">Cadastrar</button>
            </div>
          </div>
        </form>

      </div>
@endsection
