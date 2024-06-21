// Esse arquivo foi usado para acompanhar e ir praticando durante as aulas

// Aqui é mostrado basicamente como seriam as declarações de variaveis
let student = "Jhon";
let grade1 = parseFloat("2");
let grade2 = parseFloat("2");
// Aqui uma variavel tipada explicitamente
let isAproved : boolean;

// Uma função tipada
function average(num1:number, num2:number) : number {
    return (num1 + num2) / 2;
}

// ARRAYS

let grades = ["8", "9", "7", "5"]

function finalGrade(grades : string) {
    let sum = 0;
    grades.forEach(grade => sum += parseFloat(grade))
    return sum / grades.length;
}

// Objects

// type Student = {
//     name: string,
//     grades: string[],
//     isAproved: boolean
// }

interface Student {
    name: string,
    grades: string[],
}

interface Student {
    isAproved?: boolean
}

interface Person {
    name: string
}

interface Student extends Person{
    grades: string[],
    isAproved?: boolean
}


function printStudent(student: string, grades: string[]) {
    console.log("Name: ", )
    console.log("Final grade: ")
}

let newStudant = {
    Name: "Jhon",
    grade1: 8,
    grade2: 9
}

//printStudent(newStudant);

let students : Student[] = [
    {
        name: "Jhon",
        grades: ["9", "8"],
        isAproved: true
    },
    {
        name: "Maria",
        grades: ["5", "5"],
        isAproved: false
    }
]

// Literal Types

let size = "small";

// Union Types

// Ou um Ou outro
let id: string | number;

function buttonStyle(size: "small" | "large") {
    let style: {height: string, width: string}

    if(size == "small"){
        style = {
            height: "60px",
            width: "100px"
        }
    } else {
        style = {
            height: "80px",
            width: "140px"
        }
    }

    return style
}


// Null and Undefined

function printId(id: string |  number | null) {
    if(typeof id == "number") {
        console.log(id)
    } else {
        console.log(id.toUpperCase());
    }
}

let studentId = 22;

printId(studentId)

// Any

function doubleNum(num) {
    return num * 2;
}

doubleNum(2);

let person;

person = 2;

