// maskify('4556364607935616') -> '############5616'
// maskify('1') -> '1'
// maskify('11111') -> '#1111'

function maskify(text) {
  const last = text.slice(-4);

  if (text.length > 4) {
    return "#".repeat(text.length - 4) + last;
  } else {
    return last;
  }
}

console.log(maskify("aaaaaaaaaaaaaaaaaazert"));
console.log(maskify("azert"));
