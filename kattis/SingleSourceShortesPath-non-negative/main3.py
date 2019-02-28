# Eliza Shoemaker, python 2.7
# Ran out of time to comment (sorry) trying to make it run right.
# It gets stuck on the test code when it needs to print 30
# it prints 35.

import heapq


# Gets the time we must wait before we cross an edge
# time is current time
# p is the peroid
# t0 is the first time we can cross
def get_wait_time(time, P, t0):
    if P == 0:
        return t0 - time
    if time == t0:
        return 0
    if (time - t0) < 0:
        return int(t0 - time)
    else:
        return int((time - t0) % P)
 
def main():
    while True:
        # n  is the numbers of nodes in the graph
        # m  the number of edges
        # q  the number of queries
        # s  the index of the starting node
        n, m, q, s = map(int, raw_input().split(' '))
        if n == m == q == s == 0:
            return
 
        # No adjacency initially (empty lists)
        graph = [[] for _ in range(n)] 
        

        # Add edges
        for x in range(0, m):
            u, v, t0, p, d = map(int, raw_input().split(' '))
            graph[u].append((v, t0, p, d))
        

        # Calculate costs
        dist = dijkstra(graph, s)
 
        # Handle queries
        for _ in range(q):
            query = int(raw_input())
            if query in dist:
                print dist[query]
            else:
                print "Impossible"
 
        print ""
 
def dijkstra(graph, start):
    dist = {}
    queue = [(0, start)]
 
    while queue:
        d_to_u, u = heapq.heappop(queue) 
        if u in dist:
            continue
 
        dist[u] = d_to_u
 
        for v, t0, p, d in graph[u]:
            if v == start:
                continue

            if p == 0 and t0 < dist[u]:
                continue
            
            else:
                wait_time = get_wait_time(dist[u], p, t0)
                new_time = wait_time + dist[u] + d
            dist[v] = new_time
            heapq.heappush(queue, (new_time, v))
 
    return dist
 
main()