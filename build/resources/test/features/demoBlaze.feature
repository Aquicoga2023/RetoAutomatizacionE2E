#language: es
@CompraWeb
Característica: Flujo de compra en demoblaze

  @Compra
  Esquema del escenario:  Validar que se pueda realizar una compra en Demoblaze
    Dado que soy un usuario registrado en Demoblaze
    Cuando realizo una compra de <cantProds> productos en la categoria "<categoria>"
    Y completo el formulario
      | Name  | Country | City | Creditcard       | Month | Year |
      | Aaron | PERU    | LIMA | 4199651567347524 | 02    | 2024 |
    #Entonces valido que la compra se haya realizado de forma satisfactoria

    Ejemplos:

      | cantProds | categoria |
      #| 2         | Monitors  |
      | 2         | Laptops   |
      #| 2         | Phones    |


