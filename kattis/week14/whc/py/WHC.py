def utility(countryId, numOfRemainingTeams):
	if(storedValues[numOfRemainingTeams][countryId] != -1):
		return storedValues[numOfRemainingTeams][countryId]
	
	max = 0;
	for i in range(numOfRemainingTeams + 1):
		value = livesPerTeam[i][countryId] + utility(countryId - 1, numOfRemainingTeams - i)
		
		if(value > max):
			max = value
	
	storedValue[numOfRemainingTeams][countryId] = max
	return max

nums = input().split(",")
numOfTeams = int(nums[0])
numOfCountries = int(nums[1])

livesPerTeam = [[0 for j in range(numOfCountries + 1)] for i in range(numOfTeams + 1)]
storedValues = [[0 for j in range(numOfCountries + 1)] for i in range(numOfTeams + 1)]

for i in range(numOfTeams):
	curr = input().split(",")
	for j in range(numOfCountries):
		livesPerTeam[i][j] = int(curr[j])
		if( i != 0 and j != 0):
			storedValues[i][j] = -1
		

max = utility(3,5)
print(max)


