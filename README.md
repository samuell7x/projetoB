Conversor de Decimal para Binário 🔢
Este é um programa simples em Java que solicita um número inteiro ao usuário e realiza a conversão manual para sua representação binária, utilizando a lógica de divisões sucessivas por 2.

🚀 Como funciona
O algoritmo segue os seguintes passos:

Recebe um número inteiro via Scanner.

Se o número for 0, o resultado é "0".

Caso contrário, o programa realiza um loop while:

Calcula o resto da divisão por 2 (numero % 2).

Concatena esse resto à esquerda da String de resultado.

Divide o número por 2 (numero /= 2) até que ele chegue a 0.

Exibe o resultado final no console.

