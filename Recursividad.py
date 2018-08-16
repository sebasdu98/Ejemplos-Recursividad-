def par(x):
    if x==0:
        return True
    else:
        return impar(x-1)
def impar(x):
    return not par(x)
#ejemplos
print(impar(5),par(4),impar(30),par(43))
