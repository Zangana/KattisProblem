obj = map(lambda x: float(x), raw_input().split(' '))
 
cut = map(lambda x: map(lambda y: int(y), x.split('.')), raw_input().split(' '))
mix = map(lambda x: map(lambda y: int(y), x.split('.')), raw_input().split(' '))
pac = map(lambda x: map(lambda y: int(y), x.split('.')), raw_input().split(' '))
mac = map(lambda x: map(lambda y: int(y), x.split('.')), raw_input().split(' '))
print(cut)
lines = [[cut[0][0] * cut[1][1], cut[1][0] * cut[0][1], 3 * cut[0][1] * cut[1][1]],
         [mix[0][0] * mix[1][1], mix[1][0] * mix[0][1], 3 * mix[0][1] * mix[1][1]],
         [pac[0][0] * pac[1][1], pac[1][0] * pac[0][1], 3 * pac[0][1] * pac[1][1]],
         [mac[0][0] * mac[1][1], mac[1][0] * mac[0][1], 3 * mac[0][1] * mac[1][1]],
         [1, 0, 0],
         [0, 1, 0]]
 
def det(a1, a2):
    return (a1[0]*a2[1] - a2[0]*a1[1])
 
def x1(a1, a2):
    return (a2[1]*a1[2] - a1[1]*a2[2]) / det(a1, a2)
 
def x2(a1, a2):
    return (-a2[0]*a1[2] + a1[0]*a2[2]) / det(a1, a2)
 
def sat(x1, x2, lines):
    return (x1 * lines[0][0] + x2 * lines[0][1] <= lines[0][2]) and (x1 * lines[1][0] + x2 * lines[1][1] <= lines[1][2]) and (x1 * lines[2][0] + x2 * lines[2][1] <= lines[2][2]) and (x1 * lines[3][0] + x2 * lines[3][1] <= lines[3][2]) and (x1 >= 0) and (x2 >= 0)
           
 
max_obj = -1
max_x1 = -1
max_x2 = -1
 
for a1 in lines:
    for a2 in lines:
        if det(a1, a2) != 0:
            the_x1 = x1(a1, a2)
            the_x2 = x2(a1, a2)
            if sat(the_x1, the_x2, lines):
                new_obj = obj[0]*the_x1 + obj[1]*the_x2
                if new_obj < max_obj:
                    max_obj = new_obj
                    max_x1 = the_x1
                    max_x2 = the_x2
 
print str(max_x1) + ' ' + str(max_x2)
