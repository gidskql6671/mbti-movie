import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import FirstPage from './pages/FirstPage.js'
import TestingPage from './pages/TestingPage.js';
import MbtiList from './pages/MbtiList.js';
import Result from './pages/Result.js';

function App() {
  return (
    <Router>
      <Routes>
        <Route path={'/'} element={<FirstPage />} />
        <Route path={'/Testing'} element={<TestingPage />} />
        <Route path={'/List'} element={<MbtiList />} />
        <Route path={'Testing/Result'} element={<Result />} />
      </Routes>
    </Router>
  );
}

export default App;
