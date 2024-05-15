// CreatePhoneNumber ([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) -> "(123) 456-7890"

function CreatePhoneNumber(num) {
  const num1 = num.slice(0, 3).join("");
  const num2 = num.slice(3, 6).join("");
  const num3 = num.slice(6, 10).join("");

  return `(${num1}) ${num2}-${num3}`;
}

console.log(CreatePhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]));
