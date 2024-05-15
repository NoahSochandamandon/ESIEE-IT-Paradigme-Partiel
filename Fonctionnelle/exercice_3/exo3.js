// DNAStrand ("ATTGC") -> "TAACG"
// DNAStrand ("GTAT") -> "CATA"

function DNAStrand(adn) {
  const temp = adn
    .replace(/A/g, "t")
    .replace(/T/g, "a")
    .replace(/G/g, "c")
    .replace(/C/g, "g");
  return temp
    .replace(/t/g, "T")
    .replace(/a/g, "A")
    .replace(/g/g, "G")
    .replace(/c/g, "C");
}

console.log(DNAStrand("ATTGCC"));
