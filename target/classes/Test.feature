# new feature
# Tags: optional
# language: pt


  Funcionalidade: Validar cadastro no site PHPTRAVEL

  @CT-001
  Cenario: Criar cadastro site phpTravel
    Dado acesso o site
    E clico no botao "Sign Up"
    E insiro "nome" no campo "First Name"
    E insiro "sobrenome" no campo "Last Name"
    E insiro "nome da empresa" no campo "business_name"
    E insiro "ira@gmail.com.br" no campo "Email"
    Quando clico no botao "Submit"
    Entao visualizo que o cadastro foi concluído

