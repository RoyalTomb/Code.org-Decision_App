var behavior;
var look;
onEvent("findButton", "click", function( ) {
  behavior = getText("behaviorDropdown");
  look = getText("looksDropdown");
  if (behavior == "Chill" && look == "Cute") {
    showPomeranian();
  }
  if (behavior == "Chill" && look == "Cool") {
    showDalmatian();
  }
  if (behavior == "Chill" && look == "Tough") {
    showGs();
  }
  if (behavior == "Playful" && look == "Cute") {
    showPomeranian();
  }
  if (behavior == "Playful" && look == "Cool") {
    showDalmatian();
  }
  if (behavior == "Playful" && look == "Tough") {
    showDalmatian();
  }
  if (behavior == "Aggressive" && look == "Cute") {
    showPomeranian();
  }
  if (behavior == "Aggressive" && look == "Cool") {
    showGs();
  }
  if (behavior == "Aggressive" && look == "Tough") {
    showGs();
  }
  if (behavior == "Behavior" && look == "Looks") {
    pickFunction();
  }
  if (behavior == "Behavior" && look == "Cute") {
    pickFunction();
  }
  if (behavior == "Behavior" && look == "Cool") {
    pickFunction();
  }
  if (behavior == "Behavior" && look == "Tough") {
    pickFunction();
  }
  if (behavior == "Chill" && look == "Looks") {
    pickFunction();
  }
  if (behavior == "Playful" && look == "Looks") {
    pickFunction();
  }
  if (behavior == "Aggressive" && look == "Looks") {
    pickFunction();
  }
});
//Functions 
function showPomeranian() {
  showElement("dogPomeranian");
  showElement("pomeranianText");
  hideElement("dogDalmatian");
  hideElement("dogGs");
  hideElement("gsText");
  hideElement("dalmatianText");
  hideElement("pickText");
}
function showDalmatian() {
  showElement("dogDalmatian");
  showElement("dalmatianText");
  hideElement("dogPomeranian");
  hideElement("pomeranianText");
  hideElement("gsText");
  hideElement("dogGs");
  hideElement("pickText");
}
function showGs() {
  showElement("dogGs");
  showElement("gsText");
  hideElement("dogPomeranian");
  hideElement("pomeranianText");
  hideElement("dogDalmatian");
  hideElement("dalmatianText");
  hideElement("pickText");
}
function pickFunction() {
  showElement("pickText");
  hideElement("dogPomeranian");
  hideElement("pomeranianText");
  hideElement("dogDalmatian");
  hideElement("dalmatianText");
  hideElement("gsText");
  hideElement("dogGs");
}
