// number([[10,0],[3,5],[5,8]]) -> 5
// number([[3,0],[9,1],[4,10],[12,2],[6,1],[7,10]]) -> 17
// number([[3,0],[9,1],[4,8],[12,2],[6,1],[7,8]]) -> 21

function number(busListe) {
  const calcArret = busListe.map((busStop) => busStop[0] - busStop[1]);
  const result = calcArret.reduce((total, net) => total + net, 0);

  return result;
}

console.log(
  number([
    [10, 0],
    [3, 5],
    [5, 8],
  ])
);
console.log(
  number([
    [3, 0],
    [9, 1],
    [4, 10],
    [12, 2],
    [6, 1],
    [7, 10],
  ])
);
console.log(
  number([
    [3, 0],
    [9, 1],
    [4, 8],
    [12, 2],
    [6, 1],
    [7, 8],
  ])
);
