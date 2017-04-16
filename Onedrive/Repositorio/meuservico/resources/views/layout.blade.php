<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Meu Serviço</title>

        <!-- CSS -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,600">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/animate.css">
		    <link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="stylesheet" href="assets/css/media-queries.css">

        <!-- Javascript -->
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/wow.min.js"></script>
        <script src="assets/js/retina-1.1.0.min.js"></script>
        <script src="assets/js/waypoints.min.js"></script>
        <script src="assets/js/scripts.js"></script>
        <script src="js/validator.min.js"></script>

        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

        <script>
          function fechar() {
            document.getElementById("posiciona").style.display = 'none';
          }

          $(document).ready(function(){
            $("a[rel=modal]").click( function(ev){
              ev.preventDefault();

              var id = $(this).attr("href");

              var alturaTela = $(document).height();
              var larguraTela = $(window).width();

              //colocando o fundo preto
              $('#mascara').css({'width':larguraTela,'height':alturaTela});
              $('#mascara').fadeIn(1500);
              $('#mascara').fadeTo("slow",0.8);

              var left = ($(window).width() /2) - ( $(id).width() / 2 );
              var top = ($(window).height() / 2) - ( $(id).height() / 2 );

              $(id).css({'top':top,'left':left});
              $(id).show();
            });

            $("#mascara").click( function(){
                $(this).hide();
                $(".window").hide();
            });

            $('.fechar').click(function(ev){
                ev.preventDefault();
                $("#mascara").hide();
                $(".window").hide();
            });

          });


        </script>

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">

    </head>

    <body>


      <!-- Top menu -->
      <nav class="navbar navbar-inverse navbar-fixed-top navbar-no-bg" role="navigation">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#top-navbar-1">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
          </div>
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse" id="top-navbar-1">
            <ul class="nav navbar-nav">
              <li><a  href="{{url('/')}}">Home</a></li>
              <li><a class="scroll-link" href="#services">Serviços</a></li>
              <li><a class="scroll-link" href="#testimonials">Experiências</a></li>
              <li><a id="nav-cad-serv" href="{{url('cadastroServico')}}">Cadastrar serviços</a></li>
            </ul>
            <div class="navbar-text navbar-right">
              <a href="#"><i class="fa fa-facebook"></i></a>
              <a href="#"><i class="fa fa-twitter"></i></a>
              <a href="#"><i class="fa fa-instagram"></i></a>
            </div>
          </div>

        </div>
      </nav>

      <div class="content" style="absolut">
          @yield('conteudo')
      </div>

      <footer class="footer-container">
          <div class="container">
            <div class="row">

                    <div class="col-sm-6 footer-left">
                      <h3>Contact us</h3>
                      <div class="contact-form">
                        <form role="form" action="assets/contact.php" method="post">
                          <div class="form-group">
                            <label class="sr-only" for="contact-email">Email</label>
                              <input type="text" name="email" placeholder="Email..." class="contact-email form-control" id="contact-email">
                            </div>
                            <div class="form-group">
                              <label class="sr-only" for="contact-subject">Subject</label>
                              <input type="text" name="subject" placeholder="Subject..." class="contact-subject form-control" id="contact-subject">
                            </div>
                            <div class="form-group">
                              <label class="sr-only" for="contact-message">Message</label>
                              <textarea name="message" placeholder="Message..." class="contact-message form-control" id="contact-message"></textarea>
                            </div>
                            <button type="submit" class="btn">Send message</button>
                        </form>
                      </div>
                    </div>

                    <div class="col-sm-5 col-sm-offset-1 footer-right">
                      <h3>Follow us</h3>
                      <div class="footer-social">
                        <a href="#"><i class="fa fa-facebook"></i></a>
                        <a href="#"><i class="fa fa-twitter"></i></a>
                        <a href="#"><i class="fa fa-instagram"></i></a>
                      </div>
                      <div class="footer-copyright">
                        &copy; Meu Serviço<br> Disponibilizado por <a href="http://sda">Nambio S. S.</a>
                      </div>
                    </div>

                </div>
          </div>
          <div class="container-fluid">
            <div class="row">
                  <div class="col-sm-12 footer-bottom">
                    <a class="scroll-link" href="#top-content"><i class="fa fa-chevron-up"></i></a>
                  </div>
                </div>
          </div>
        </footer>
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


    </body>

</html>
