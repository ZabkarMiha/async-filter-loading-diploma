"use client"

import Filters from "@/app/components/filters";
import { useState } from "react";

export default function FilterPage() {
    const [showComponent, setShowComponent] = useState(false);

    const handleButtonClick = () => {
        setShowComponent(true);
    };

    return (
        <div>
            <button onClick={handleButtonClick}>Show Component</button>
            {showComponent && <Filters />}
        </div>
    );
}
