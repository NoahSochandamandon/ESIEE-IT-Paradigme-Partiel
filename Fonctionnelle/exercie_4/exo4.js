// Filter_list ([1,2, 'a', 'b']) -> [1,2]
// Filter_list ([1, 'a', 'b', 0,15]) -> [1,0,15]
// Filter_list ([1,2, 'aasf', '3', '124', 123]) -> [1,2,123]

function Filter_list(list) {
  const num = list.filter((item) => {
    return (
      typeof item === "number" ||
      (typeof item === "string" && parseInt(item).toString() === item)
    );
  });

  return num.map((item) => {
    return parseInt(item);
  });
}

console.log(Filter_list([1, 2, "a", "b"]));
console.log(Filter_list([1, "a", "b", 0, 15]));
console.log(Filter_list([1, 2, "aasf", "3", "124", 123]));
