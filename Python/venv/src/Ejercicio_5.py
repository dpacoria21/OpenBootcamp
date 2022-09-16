def isBisiesto(year):
    result = ''
    if(year % 100 == 0 and year%400 != 0):
        result = 'No es ano bisiesto'
    elif( year % 4 != 0 ):
        result = 'No es ano bisiesto'
    else:
        result = 'Es ano bisiesto'
    return f'{year} = {result}'

print(isBisiesto(2016))