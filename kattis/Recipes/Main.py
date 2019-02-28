def scale_recipe(case, r, p, d):
    ingredients = {}
    main = None
    for i in range(r):
        line = input().split()
        line[1] = float(line[1])
        line[2] = float(line[2])
 
        # add i to key to preserve insertion order
        ingredients[(i, line[0])] = [line[1], line[2]]
 
        if line[2] == 100.0:
            main = (i, line[0])
 
    scaling_factor = d/p
    main_scaled_weight = ingredients[main][0]*scaling_factor
    ingredients[main][0] = main_scaled_weight
 
    print("Recipe # %d" % (case+1))
    for k in sorted(ingredients):
        v = ingredients[k]
        if k != main:
            v[0] = v[1]*main_scaled_weight/100
 
        print("%s %.1f" % (k[1], v[0]))
    print("----------------------------------------")
 
T = int(input())
 
for case in range(T):
    R, P, D = map(int, input().split())
    scale_recipe(case, R, P, D)
