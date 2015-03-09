def readInteger() {
return (new InputStreamReader(System.in).readLine()).toString().toInteger()
}

int numero,unidades=0,decenas=0,centenas=0,miles=0
String rom1="",rom2="",rom3="",rom4=""
println ("Ingrese un numero:")
numero = readInteger()

unidades=numero%10/1
decenas=numero%100/10
centenas=numero%1000/100
miles=numero%10000/1000

switch (unidades) {
case 1: rom1="I"
        break
case 2: rom1="II"
        break
case 3: rom1="III"
        break
case 4: rom1="IV"
        break
case 5: rom1="V"
        break
case 6: rom1="VI"
        break
case 7: rom1="VII"
        break
case 8: rom1="VIII"
        break
case 9: rom1="IX"
        break
}

switch(decenas){
case 1: rom2="X"
        break
case 2: rom2="XX"
        break
case 3: rom2="XXX"
        break
case 4: rom2="XL"
        break
case 5: rom2="L"
        break
case 6: rom2="LX"
        break
case 7: rom2="LXX"
        break
case 8: rom2="LXXX"
        break
case 9: rom2="XC"
        break
}

switch(centenas){
case 1: rom3="C"
        break
case 2: rom3="CC"
        break
case 3: rom3="CCC"
        break
case 4: rom3="CD"
        break
case 5: rom3="D"
        break
case 6: rom3="DC"
        break
case 7: rom3="DCC"
        break
case 8: rom3="DCCC"
        break
case 9: rom3="CM"
        break
}

switch(miles){
case 1: rom4="M"
        break
case 2: rom4="MM"
        break
case 3: rom4="MMM"
        break
case 4: rom4="IV"
        break
case 5: rom4="V"
        break
case 6: rom4="VM"
        break
case 7: rom4="VMM"
        break
case 8: rom4="VMMM"
        break
case 9: rom4="MX"
        break
}

println("")
println ("En romanos es: " + (rom4+rom3+rom2+rom1))

