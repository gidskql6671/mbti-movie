import React, {useState} from 'react';
import { Link } from 'react-router-dom';
import '../styles/TestingPage.css';

const TestingPage = () => {
    const [EI, setEI] = useState("E");
    const [SN, setSN] = useState("S");
    const [TF, setTF] = useState("T");
    const [JP, setJP] = useState("J");
    return (
        <div className="list-container">
            <div className="list-box">
                <div className="list-div">
                    <ul className="e-list">
                        <li class="tile">
                            <input type="radio" className="hide" id="E" name="EI" onClick={()=> setEI('E')}/>
                            <label htmlFor="E">E</label>
                        </li>
                        <li class="tile">
                            <input type="radio" className="hide" id="S" name="SN" onClick={()=> setSN('S')}/>
                            <label htmlFor="S">S</label>
                        </li>
                        <li class="tile">
                            <input type="radio" className="hide" id="T" name="TF" onClick={()=> setTF('T')}/>
                            <label htmlFor="T">T</label>
                        </li>
                        <li class="tile">
                            <input type="radio" className="hide" id="J" name="JP" onClick={()=> setJP('J')}/>
                            <label htmlFor="J">J</label>
                        </li>
                    </ul>
                </div>
                <div className="list-div">
                    <ul className="i-list">
                        <li class="tile">
                            <input type="radio" className="hide" id="I" name="EI" onClick={()=> setEI('I')}/>
                            <label htmlFor="I">I</label>
                        </li>
                        <li class="tile">
                            <input type="radio" className="hide" id="N" name="SN" onClick={()=> setSN('N')}/>
                            <label htmlFor="N">N</label>
                        </li>
                        <li class="tile">
                            <input type="radio" className="hide" id="F" name="TF" onClick={()=> setTF('F')}/>
                            <label htmlFor="F">F</label>
                        </li>
                        <li class="tile">
                            <input type="radio" className="hide" id="P" name="JP" onClick={()=> setJP('P')}/>
                            <label htmlFor="P">P</label>
                        </li>
                    </ul>
                </div>
            </div>
            <div>
                <div className="result-box">
                    <ul className="result">
                        <li class="tile">{EI}</li>
                        <li class="tile">{SN}</li>
                        <li class="tile">{TF}</li>
                        <li class="tile">{JP}</li>
                    </ul>
                    <Link to="Result"
                        state= {{ mbti: `${EI}${SN}${TF}${JP}` }}>
                            <button>SHOW RESULT</button>
                    </Link>
                </div>
            </div>
        </div>
    );
}

export default TestingPage;