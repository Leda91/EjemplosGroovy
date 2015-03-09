def esPrimo = {
    n -> if(n==2) return true
    if(n%2==0) return false
    raiz = Math.sqrt(n)
    for(i=3; i<=raiz; i+=2) if(n%i==0) return false
    return true
    }
    limite = 0..100
    listaPrimos = []
    while(listaPrimos.size < 10) {
    
    limite.each{
    
         numero = it
    
    if(esPrimo(numero)) listaPrimos.add numero
    }
    }
    println listaPrimos